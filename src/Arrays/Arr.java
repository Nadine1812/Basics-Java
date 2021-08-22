package Arrays;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		
		int[] arr;
		int arr2[];
		
		arr = new int[10];
		System.out.println(arr.length); //10
		System.out.println(arr[0]); //0
		
		double[] arr3 = new double[10];
		System.out.println(arr3[0]); //0.0
		
		boolean[] arr4 = new boolean[10];
		System.out.println(arr4[0]); //false
		//System.out.println(arr4[10]); //Error
		
		int[] arr5 = {3 , 2 , 1 };
		
		int[][] matrix = {
				{1 , 2 , 3 },
				{4 , 5 , 6 }
		};
		System.out.println(matrix[0][2]); //3
		
		int[][] matrix2 = new int [10][0];
		System.out.println(matrix2[0]);
		
		System.out.println(Arrays.toString(arr5)); //[3, 2, 1]
		
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5)); //[1, 2, 3]
	}
}
