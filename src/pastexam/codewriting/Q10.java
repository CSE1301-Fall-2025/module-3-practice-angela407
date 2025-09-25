package pastexam.codewriting;
public class Q10 {

	/* We wish to write a program that will compute and print the sum of both diagonals of a 
	square 2D array. For example, if you were given:
	1 2 3
	4 5 6
	7 8 9
	then your program should print 30 which is (1 + 5 + 9) + (3 + 5 + 7). Complete the code below 
	to compute the sum of the diagonals the given array. Your code should work regardless of the 
	size of this array or the values that it contains, though you may assume that the given array 
	will always besquare (number of rows is equal to number of columns).
	*/
	
	public static void main(String[] args) {
		
		/* Actual values given here for practice, but your solution should work for arrays of any
		size! Add and subtract some rows and columns to make sure your solution works properly */
		
		int[][] data = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; 
		int size = data.length; // assuming square array; # row = # col
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;
		// loop through the array to compute the sum of primary diagonal
		for (int i= 0; i < size; i++) {
			primaryDiagonalSum = primaryDiagonalSum + data[i][1];
		}
		// loop through array to compute the sum of secondary diagonal
		for (int i = 0; i < size; i++) {
			secondaryDiagonalSum = secondaryDiagonalSum + data[i][size - i - 1];
		}	
		System.out.println("Sum of primary digonal: " + primaryDiagonalSum);
		System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);
		System.out.println("Total sum of both diagonals: " + (primaryDiagonalSum + secondaryDiagonalSum));
	}
}
