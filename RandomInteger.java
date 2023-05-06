/* Experiment 1
   AIM: Generate a random number upto 100 and print whether it is prime or not.

   Raghav Singh
   00615611921
   S13 (AI & DS)
*/

class RandomInteger {
    public static void main(String args[]) {
        int min = 0;
        int max = 100;
        // Generate random int value from 200 to 400
        int b = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Random value of type int between " + min + " to " + max + ": " + b);

        boolean isPrime = true;
        // Check whether the number is prime or not:
        for (int i = 2; i < b; i++) {
            if (b % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == false) {
            System.out.println("The number is not prime.");
        }
        else {
            System.out.println("The number is prime.");
        }
    }
}