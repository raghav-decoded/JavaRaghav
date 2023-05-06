/* Experiment 5
   AIM: Design a class that perfbrm String operations (Equal, Reverse the string, change case). 

   Raghav Singh
   00615611921
   S13 (AI & DS)
*/

class str {
    public static void main(String args[]) {
        String myStr1 = "Hello World";
        String myStr2 = "Hello World";
        String myStr3 = "Hello Raghav";

        // Equality
        System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
        System.out.println(myStr1.equals(myStr3)); // false

        // Reverse
        System.out.println(StringFormatter.reverseString(myStr1));

        // Change case
        System.out.println(myStr3.toUpperCase());
        System.out.println(myStr3.toLowerCase());

        // Concatenation
        String firstName = "Raghav ";
        String lastName = "Singh";
        System.out.println(firstName.concat(lastName));

    }
}