/* Experiment 3
   AIM: Write a program to find the transpose of a matrix in JAVA
   
   Raghav Singh
   00615611921
   S13 (AI & DS)
*/

class transposeMatrix {
	static final int N = 4;

	// This function stores transpose
	// of A[][] in B[][]
	static void transpose(int A[][], int B[][])
	{
		int i, j;
		for (i = 0; i < N; i++)
			for (j = 0; j < N; j++)
				B[i][j] = A[j][i];
	}

	// Driver code
	public static void main(String[] args)
	{
		int A[][] = { { 1, 1, 1, 1 },
					{ 2, 2, 2, 2 },
					{ 3, 3, 3, 3 },
					{ 4, 4, 4, 4 } };
					
		int B[][] = new int[N][N], i, j;
		
		System.out.print("Original matrix was \n");
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++)
				System.out.print(A[i][j] + " ");
			System.out.print("\n");
		}
		// Function call
		transpose(A, B);

		System.out.print("Result matrix is \n");
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++)
				System.out.print(B[i][j] + " ");
			System.out.print("\n");
		}
	}
}

