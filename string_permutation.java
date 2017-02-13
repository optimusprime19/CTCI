package ctci;

import java.util.Scanner;

public class string_permutation {

	private static final int MAX_LENGTH = 100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String String1 = sc.next();
			String String2 = sc.next();
			
			if(String1.equals("end") || String2.equals("end"))
				break;
			
			int[] s1_arr = new int[128];
			int[] s2_arr = new int[128];
			int index;
			
			for (int i=0; i < String1.length(); i++) {
				index = (int) String1.charAt(i);
				s1_arr[index]++;
			}
			for (int i=0; i < String2.length(); i++) {
				index = (int) String2.charAt(i);
				s2_arr[index]++;
			} 
			
			int i = 0;
			while(s1_arr[i] == s2_arr[i]) {
				i++;
				if (i == 128) {
					System.out.println("same");
					break;
				} 
			}
			
			if (i < 128) {
				System.out.println("Not same");
			}
		}
		
		System.out.println("Program terminated");
	}

}
