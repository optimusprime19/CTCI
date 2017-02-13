/*
problem - Given a string , write a function to check if it's a permutation of a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a
rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
Input: Tact coa
Output: True (permuatations: "taco cat" , "atco cta", etc..)
*/

package ctci;

import java.util.Scanner;

public class palindrom_permutations {
	private static final int MAX_LENGTH = 100;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String String1 = sc.nextLine();
			
			
			if(String1.equals("end"))
				break;
			
			int truelength = 0;
			for (int i = 0; i< String1.length(); i++) {
				if (!Character.isWhitespace(String1.charAt(i))) {
					truelength++;
				}
			}
			int[] s1_arr = new int[128];
			
			int index;
			
			for (int i=0; i < String1.length(); i++) {
				index = (int) String1.charAt(i);
				if (index >= 65 && index <=90) {
					index += 32;
				}
				s1_arr[index]++;
				if (String1.charAt(i) == ' ') {
					s1_arr[index]++;
				}
			}
			
			int max_odd = 0;
			boolean palindrome = true;
			if (truelength %2 == 0) {
				/* even, don't allow any odd count */
				for (int i = 0; i< 128; i++) {
					if (s1_arr[i] %2 != 0 ) {
						palindrome = false;
						System.out.println("False: Even Not a palindrome");
						break;
					}
				}
				
			} else {
				/* Odd , allow one odd count at max */
				for (int i = 0 ; i < 128; i++) {
					if (s1_arr[i] %2 !=0 ) {
						max_odd++;
					}
					
					if (max_odd > 1) {
						palindrome = false;
						System.out.println("False: odd Not a palindrome");
						break;
					}
				}
				
			}
			
			if (palindrome) {
				System.out.println("True: a Palindrome");
			}
		}
		
		System.out.println("Program terminated");
	}

}
