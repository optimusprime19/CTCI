/*
* problem - Implement an algorithm to determine if a string has all unique chars
*/

package ctci;

import java.util.Scanner;

public class isUnique {
	private static final int MAX_LENGTH = 100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String Input_String = sc.next();
			
			if(Input_String.equals("end"))
				break;
			
			char[] ch_array = new char[MAX_LENGTH]; 
			ch_array = Input_String.toCharArray();
			int val, i;
			boolean[] a = new boolean[128];
			for (i = 0; i < ch_array.length; i++) {
				val = (int) ch_array[i];
				if (a[val]) {
					System.out.println("Not unique");
					break;
				}
				a[val] = true;
			}
			
			if ( i == ch_array.length)
				System.out.println("unique");
			
			
		}
		
		System.out.println("Program terminated");
	}

}
