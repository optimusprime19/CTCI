
/* problem -
 * 
 * write an algorithm such that if an element in an M*N matrix is 0,
 * it's entire row and cols are set to 0.
 */

package ctci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zero_Matrix {
	
	static void makerowzero (int k, int[][]mat) {
		for (int i =0; i < mat[k].length; i++) {
			mat[k][i] = 0;
		}
	}
	
	static void makecolzero (int k, int[][]mat) {
		for (int i =0; i < mat.length; i++) {
			mat[i][k] = 0;
		}
	}
	
	static void applyzeromatrix (int[][] mat) {
		
		/* Find out which rows and cols have to made zero */
		
		ArrayList<Integer> row_tobe_zero = new ArrayList<Integer>();
		ArrayList<Integer> col_tobe_zero = new ArrayList<Integer>();
		
		for (int i = 0; i < mat.length ; i++) {
			for (int j = 0 ; j < mat[i].length; j++) {
				if (mat[i][j] == 0) {
					row_tobe_zero.add(i);
					col_tobe_zero.add(j);
				}
			}
		}
		
		
		for (int k:row_tobe_zero) {
			makerowzero(k, mat);
		}
		for (int k:col_tobe_zero) {
			makecolzero(k,mat);
		}
		
	}
	static void displaymatrix (int[][] mat) {
		for (int i =0 ; i <mat.length; i++) {
			for (int j= 0; j< mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		
		int[][] matrix = null;
		
		while (sc.hasNext()) {
			int rows = sc.nextInt();
			int cols = sc.nextInt();
			
			matrix = new int[rows][];
			for (int i = 0; i< rows; i++) {
				matrix[i] = new int[cols];
			}
			
			for (int i = 0 ; i < rows; i++) {
				for (int j =0 ; j < cols; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}
			
			break;
		}
		
		applyzeromatrix(matrix);
		
		displaymatrix(matrix);
		
	}

}
