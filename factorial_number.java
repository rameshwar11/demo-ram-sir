package practice_1;
import java.util.Scanner;
public class factorial_number {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		int fact=1;
		int n;
		System.out.println("Enter the number:");
		n= SC.nextInt();
		while(n>0) {
			fact=fact*n;
			n=n-1;
		}
              
			System.out.println("factorial= "+fact);
		}

	}

