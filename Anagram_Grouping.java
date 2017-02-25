/* Anagram grouping 
 * 
 * The task here is to given list of strings , group them if they are anagrams
 * for ex: rat, cat, art, baab, tac, abba  - rat and art are anagrams, cat and tac are and so on
 * 
 * O/p - [rat, art] ,
 *       [cat, tac]
 *       [baab, abba]
 */


package Misc;

import java.util.*;

public class Anagram_Grouping {
	
	public static int getKey(String S) {
		
		int[] s_arr = new int[128];
		int key = 0;
		
		for(int i=0; i <S.length(); i++) {
			int temp = (int) S.charAt(i);
			s_arr[temp]++;
		}
		
		
		for (int i= 0; i < 128; i++) {
			key+=(s_arr[i] * i );
		}
		
		return key;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashMap<Integer, ArrayList<String>> map = new LinkedHashMap<Integer, ArrayList<String>>();
		while (sc.hasNext()) {

			String Input_String = sc.next();

			if(Input_String.equals("end"))
				break;

			int Key = getKey(Input_String);
			
			System.out.println("Key for " +Input_String + " is " +Key);
			
			//Iterate Hashmap and if Key is present get the arraylist and add, if not
			// create a new arraylist and add
			
			if (map.containsKey(Key)) {
				ArrayList<String> list = null;
				list = map.get(Key);
				list.add(Input_String);
			} else {
				ArrayList<String> list = new ArrayList<String> ();
				list.add(Input_String);
		        map.put(Key, list);
			}
			
			
		}
		
		for (Integer temp: map.keySet()) {
			ArrayList<String> list = null;
			list = map.get(temp);
			System.out.print(" [ ");
			 for (int i= 0 ;i < list.size(); i++) 
				 System.out.print(list.get(i) + " , ");
		
		    System.out.print("]");
			System.out.println();	 
		}


	}

}
