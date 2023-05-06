/* Experiment 4
   AIM: Write a program to display Floyd's triangle in JAVA
   
   Raghav Singh
   00615611921
   S13 (AI & DS)
*/

// Main class
class floyd {

	// Main driver method
	public static void main(String[] args)
	{
		// No of rows to be printed
		int n = 5;

		// Creating and initializing variable for
		// rows, columns and display value
		int i, j, k = 1;

		// Nested iterating for 2D matrix
		// Outer loop for rows
		for (i = 1; i <= n; i++) {

			// Inner loop for columns
			for (j = 1; j <= i; j++) {

				// Printing value to be displayed
				System.out.print(k + " ");

				// Incremeting value displayed
				k++;
			}

			// Print elements of next row
			System.out.println();
		}
	}
}
