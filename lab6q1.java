package cs130class;

import java.util.*;

public class lab6q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		
		int length = word.length();
		
		if(length%2 ==0 ) {
			System.out.println("Word has an even number of letters");
			
		}
		else {
			System.out.println("Word has an odd number of letters");
		}

	}

}
