package Sorting;

public class SelectionSort {
	public static void main(String args[]) {
		int[] array = {9,43,65,2,5,7,19};
		selectionSort(array);
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void selectionSort(int[] array) {
		int length = array.length;
		for(int i = 0; i<length-1; i++) {
			int min = i; 
			int temp = array[min];
			for(int j = i+1; j<length; j++) {
				if(array[j]<array[min]) {
					min = j;
				}
			}
			array[i] = array[min];
			array[min] = temp;
		}
	}
}
