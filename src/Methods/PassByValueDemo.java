package Methods;

import java.util.Arrays;

public class PassByValueDemo {

	public static void main(String[] args) {
		
		int i = 10;
		
		ChangeIntValue(i);
		System.out.println("i after ChangeIntValue():\t" +i);

		i = changeInt(i);
		System.out.println("i after changeInt():\t\t" +i);
		
		int[] array = {1,2,3};
		
		System.out.println("array before changeArray():\t" + Arrays.toString(array));
		changeArray(array);
		System.out.println("array after changeArray():\t" + Arrays.toString(array));
		
		cleanArray(array);
		System.out.println("array after clearArray():\t" + Arrays.toString(array));
	}
	public static void ChangeIntValue(int i) {
		i +=100;
	}
	public static int changeInt(int i) {
		i +=100;
		return i;
	}
	public static void changeArray(int[] array) {
		array[1] = 200;
	}
	public static void cleanArray(int[] array) {
		array = null;
	}
}
