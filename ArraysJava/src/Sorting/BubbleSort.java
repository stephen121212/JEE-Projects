package Sorting;

public class BubbleSort {
	public static void main(String args[]) {
		int[] array = {9,43,65,2,5,7,19};
		bubbleSort(array);
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void bubbleSort(int[] array) {
		int length = array.length;
		for(int i = 0; i<length-1; i++) {
			for(int j = 0; j<length-1; j++) {
				if(array[j] > array[j+1]) {
				int temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}
		}
	}
}
}
