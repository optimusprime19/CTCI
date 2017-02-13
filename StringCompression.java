/*

problem : 
Implement a method to perform basic compression using the counts of repeated characters
For ex - String aabccccccaaa   would become a2b1c6a3
If the compressed string wouldn't become smaller it should return the same string.
You can assume the string has only uppercase and lowercase letters

*/


package ctci;

import java.util.Scanner;

public class StringCompression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			String String1 = sc.next();

			int[] S1_arr = new int[52];
			int index;
			char ch;
			for (int i = 0; i <String1.length(); i++) {
				ch = (Character.isUpperCase(String1.charAt(i)))? 'A' : 'a';
				index = String1.charAt(i) - ch;
				S1_arr[index]++;
			}
			boolean Output_changes = false;

			for (int i=0 ; i< 52; i++) {
				if (S1_arr[i] > 1) {
					Output_changes = true;
					break;
				}
			}

			StringBuffer sb = new StringBuffer("");
			char ch_next = '\0';
			int count = 1;
			if (Output_changes) {
				for (int i = 0; i < String1.length(); i++) {
					char input = String1.charAt(i);
					
					if (i != String1.length() - 1)
						ch_next = String1.charAt(i+1);
					else
						ch_next = '\0';
					
					if (ch_next == input) {
						count++;
					} else {
						sb.append(input);
						sb.append(count);
						count = 1;
					}
					
				}

				System.out.println(sb.toString());
			}	else {
				System.out.println(String1);
			}



		}

		System.out.println("Program terminated");
	}
}
