package cs130class;

import java.util.*;

public class lab6q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double triangle, hypo;
		
		System.out.println("Enter side a: ");
		double a = scan.nextDouble();
		
		System.out.println("Enter side b: ");
		double b = scan.nextDouble();
		
		System.out.println("Enter the hypotenuse: ");
		double c = scan.nextDouble();
		
		triangle = ((Math.pow(a, 2))+(Math.pow(b, 2)));
		System.out.println(triangle);
		
		hypo = (Math.pow(c, 2));
		System.out.println(hypo);
		
		
		if(triangle == hypo) {
			System.out.println("The inputs are a Right Triangle.");
		}
		else {
			System.out.println("The inputs are NOT a right triangle.");
		}

	}

}
