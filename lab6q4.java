package cs130class;

import java.text.NumberFormat;
import java.util.*;

public class lab6q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberFormat n1 = NumberFormat.getPercentInstance();
		
		System.out.println("Enter classes held:");
		int a = scan.nextInt();
		System.out.println("Enter classes attended:");
		int b = scan.nextInt();
		
		double f = .75;
		
		double c = b*100/a; 
		
		System.out.println(n1.format(c/100));
		
		if(c > 75) {
			System.out.println("Able to attend!");
		}
		else {
			System.out.println("Unable to attend.");
		}

	}

}
