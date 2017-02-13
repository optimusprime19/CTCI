
/*
 * problem - Given two strings s1 and s2 , write a code to check if s2 is a rotation of s1
 * 
 *  For ex - waterbottle is a rotation of erbottlewat
 */

package ctci;

import java.util.Scanner;

public class StringRotation {
	
	static boolean isSubString (String S1, String S2){
		
		int i =0, j = 0;
		
		boolean ret = false;
		
		boolean found = false;
		
		while (i < S2.length()) {
			
			if (S2.charAt(i) != S1.charAt(j)) {
				j++;
			} else	{
				found = true;
				
				while (i < S2.length()) {
					if (S2.charAt(i) == S1.charAt(j) ) {
						i++;
						j++;
						ret = true;
					} else {
						ret = false;
						break;
					}
				}
			}
			
			if (found)
				break;
		}
		
		
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String s1 = sc.next();
			String s2 = sc.next();
			
			if (s1.length() != s2.length()) {
				System.out.println("false");
				break;
			}

			if (s1.equals("break") || s2.equals("break")) {
				break;
			}
			
			
			String result = s1+s1;
			
			System.out.println(isSubString(result, s2));
		}
		
		
		System.out.println("Program Terminated");
	}

}
