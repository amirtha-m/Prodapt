package DaySeven.exceptionassignment;

public class SmallestArrayElement {
	public static int findMinRec(int A[], int n) {
		// if size = 0 means whole array
		// has been traversed
		if (n == 1)
			return A[0];
 
		return Math.min(A[n - 1], findMinRec(A, n - 1));
	}
 
	// Driver code
	public static void main(String args[]) {
		int A[] = { 5, 4, 54, 5, 50, 80, 7 };
		int n = A.length;
 
		// Function calling
		System.out.println("The Smallest number in the array is: " + findMinRec(A, n));
	}
}
 
 



