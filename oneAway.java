/*
problem - There are three type of edits that can be performed on strings

1. insert a character
2. remove a character
3. replace a character
Given two strings, write a function to check if they are one edit (or zero edits) away

Ex:
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false
*/

package ctci;

import java.util.Scanner;

public class oneAway {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String String1 = sc.next();
			String String2 = sc.next();
			
			if(String1.equals("end"))
				break;
			
			int S1_Bmap = 0, S2_Bmap = 0, R_bmap, index = 0;
			
			for (int i = 0; i< String1.length(); i++) {
				index = String1.charAt(i) - 'a';
				S1_Bmap |= (1 << index); 
			}
			
			for (int i = 0; i< String2.length(); i++) {
				index = String2.charAt(i) - 'a';
				S2_Bmap |= (1 << index); 
			}
			
			R_bmap = S1_Bmap & (~S2_Bmap);
			
			//Count 1's in R_Bmap
			
			int no_of_ones = 0;
			
			for (int i =0 ; i <32 ; i++) {
				if ((R_bmap & (1 << i)) != 0) {
					no_of_ones++;
				}
			}
			
			if (no_of_ones <= 1) {
				System.out.println("True, One or less edits away ");
			} else {
				System.out.println("False, More than one edit");
			}
		}
		
		System.out.println("Program terminated");
	}

}
