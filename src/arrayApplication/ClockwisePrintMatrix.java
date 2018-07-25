package arrayApplication;

import java.util.Scanner;
/**
 * 
 * @author Teng Dening
 *	顺时针打印矩阵
 */
public class ClockwisePrintMatrix {
	private static Scanner scanner;

	public static void main(String[] args){
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] array = new int[n][];
		for(int index = 0; index < n;index++){
			int[] arr1 = new int[m];
			for(int index1 = 0; index1 < m; index1++){
				arr1[index1] = scanner.nextInt();
			}
			array[index] = arr1;
		}
		clockwisePrintMatrix(array);
		
	}
	public static void printMatrix(int [][] array){
		for(int[] index1 : array){
			for(int index2 : index1){
				System.out.print(index2+" ");
			}
			System.out.println();
		}
	}
	public static void printLine(int[] array){
		for(int index : array){
			System.out.print(index + " ");
		}
		//System.out.println();
	}
	
	public static void clockwisePrintMatrix(int[][] array){
		printLine(array[0]);
		if(array.length > 1){
			int n = array.length - 1;
			int m = array[1].length;
			int[][] matrix = new int [m][n];
			for(int index1 = 0; index1 < m; index1++){
				for(int index2 = 0; index2 < n; index2++){
					matrix[index1][index2] = array[index2+1][m-index1-1];
				}
			}
			clockwisePrintMatrix(matrix);
		}
	}
}
