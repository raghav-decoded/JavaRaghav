/* Experiment 4
   AIM: Create a class to find out the area and perimeter of a rectangle

   Raghav Singh
   00615611921
   S13 (AI & DS)
*/

import java.util.*;

//Rectangle.java contains Rectangle class

class Use_Rectangle {
	
	public static void main(String args[])
	{
		// Object of Rectangle class is created
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
		rect.length = sc.nextInt();
		System.out.println("Enter the width of the rectangle: ");
		rect.width = sc.nextInt();

		System.out.println("Length = " + rect.length);
		System.out.println("Width = " + rect.width);

		rect.Area();
		rect.Perimeter();
		sc.close();
	}
}
