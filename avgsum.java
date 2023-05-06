/* Experiment 3
   AIM: Find the average and sum of array of N numbers entered by the user.

   Raghav Singh
   00615611921
   S13 (AI & DS)
*/

import java.util.*;
public class avgsum
{
    public static void main(String[] args) {
        float sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        float arr[] = new float[n];
        System.out.println("Enter " + n + " array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
        }
        float average = sum/n;
        System.out.println("Average of numbers is : " + average +"\nSum of numbers is : "+ sum);
        sc.close();
    }
}