package Sorting;

public class InsertionSort {
	public static void main(String args[]) {
		int[] array = {9,43,65,2,5,7,19};
		insertionSort(array);
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void insertionSort(int[] array) {
		int length = array.length;
		for(int i = 0; i<length; i++) {
			int key = array[i];
			int j = i-1;
			
			while(j>=0 && array[j]>key) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
		}
	}
}
