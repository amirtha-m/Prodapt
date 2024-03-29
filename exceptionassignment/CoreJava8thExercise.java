package DaySeven.exceptionassignment;

import java.util.Scanner;

public class CoreJava8thExercise {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the no of array elements: ");
		int N = Scan.nextInt();
		System.out.println("Enter the array elements: ");
		int[] myArray = new int[N];
		for (int i = 0; i < N; i++) {
			myArray[i] = Scan.nextInt();
		}
		int small = findSmallestelementIndex(myArray);
		System.out.println("Smallest element's Index  is: " + small);
		Scan.close();
	}

	private static int findSmallestelementIndex(int[] myArray) {
		// TODO Auto-generated method stub
		return 0;
	}}
 
	