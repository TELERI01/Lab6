package cs130class;

import java.util.*;

public class lab6q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter side a:");
		int a = scan.nextInt();
		System.out.println("Enter side b:");
		int b = scan.nextInt();
		
		if (a==b) {
			System.out.println("It is a square!");
		}
		else {
			System.out.println("It is NOT a square!");
		}
		

	}

}
