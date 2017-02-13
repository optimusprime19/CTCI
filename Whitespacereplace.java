/*

problem - Write a method to replace all spaces in a string with %20

Input -  Mr John Smith
Output - Mr%20John%20Smith

*/


package ctci;

import java.util.Arrays;
import java.util.Scanner;

public class Whitespacereplace {
	private static final int MAX_LENGTH = 100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String Input_String = sc.nextLine();
			
			if(Input_String.equals("end"))
				break;
			
			char[] src_array = new char[MAX_LENGTH];
					
			int src_length = Input_String.length();
			
			int space_count = 0;
			for (int i=0 ; i < Input_String.length(); i++) {
				if (Character.isWhitespace(Input_String.charAt(i))) {
					space_count++;
				}
			}
			
			int dest_length = src_length + (space_count *2);
			
			src_array = Arrays.copyOf(Input_String.toCharArray(), dest_length);
			
			for (int i = src_length-1, j = dest_length-1; i >= 0 && j>=0 ; i-- , j--) {
				if (!Character.isWhitespace(src_array[i])) {
					src_array[j] = src_array[i];
				} else {
					src_array[j] = '0';
					j--;
					src_array[j] = '2';
					j--;
					src_array[j] = '%';
				}
				
			}
			
						
			System.out.println(src_array);
			
			
			
		}
		
		System.out.println("Program terminated");
	}

}
