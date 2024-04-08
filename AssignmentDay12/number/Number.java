package employee.number;

import java.util.Scanner;

public class Number {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=scan.nextInt();
		int result = intCheckPrime(n);
		if(result==1) {
			System.out.println(n+"is a Prime Number");
		}else {
			System.out.println(n+"is Not a Prime Number");
		}
		boolean result1=checkAmstrongnumber(n);
		if(result1) {
			System.out.println(n+"is Amstrong Number");
		}else {
			System.out.println(n+"is Not a Amstrong Number");
		}
		boolean result2=checkPalindromeorNot(n);
		if(result2) {
			System.out.println(n+"is Palindrome Number");
		}else {
			System.out.println(n+"is Not a Palindrome Number");
		}
		scan.close();
	}
	private static boolean checkPalindromeorNot(int n) {
		// TODO Auto-generated method stub
		return false;
	}
	public static int intCheckPrime(int N) {
		int flag=0;
		if (N <= 1) {
            return flag;
 
		}
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
            	return flag;
            }
            
        }
        
		return flag=1;
	}
	public static boolean checkAmstrongnumber(int N) {
		int Number = N, remain, result = 0;
        boolean status= false;
 
        while (Number != 0) {
            remain = Number % 10;
            result += Math.pow(remain, 3); // Cubing each digit
            Number /= 10;
        }
 
        if (result == Number) {
        	status=true;
        }
		return status;
		
	}
	public static boolean checkPalindromeorNot1(int N) {
		boolean status= false;
		int remain, sum = 0, temp;
        temp = N;
        while (N > 0) {
            remain = N % 10; // Get the remainder
            sum = (sum * 10) + remain;
            N = N / 10;
        }
        if (temp == sum) {
            status=true;
        }
        
 
		return status;
	}
 
}

