package cs130class;

import java.util.*;

public class lab6q5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number1");
		int num1 = scan.nextInt();
		System.out.println("Enter number2");
		int num2 = scan.nextInt();
		
		int Temp = num1;
		
		num1 = num2;
		num2 =Temp;
		
		
				
		System.out.println("Number: " + num1 + num2);
	

	}

}
