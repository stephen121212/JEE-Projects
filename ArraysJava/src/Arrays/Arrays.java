package Arrays;


public class Arrays {
	public static void main(String[] args) {
		String[] myArray = {"a","b","c","d"};
		String[] returnedArray = push(myArray, "r");
		String[] returnedArray2 = pop(returnedArray);
		String[]removedElementArray = removeElementbyString(myArray, "b");
		printEachCharacter(removedElementArray);
		int index = getIndexofString(myArray, "r");
		System.out.println(index);
		System.out.println(reverseString("Hello my Friends"));
		char[] backwardsCharacters = reverseCharacterArray("Hello my friends");
		System.out.println(backwardsCharacters);
		
		int[] array1 = {1,3,5,7};
		int[] array2 = {2,3,6,9};
		int[] mergedArrays = mergeSortedArrays(array1, array2);
		for(int i = 0; i<mergedArrays.length; i++) {
			System.out.println(mergedArrays[i]);
		}
	}
	
	public static void printEachCharacter(String[] myArray) {
		for(int i = 0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	
	public static void getCharacters(String item) {
		char[] characters = item.toCharArray();
		for(char output: characters) {
			System.out.println(output);
		}
	}
	
	public static String reverseString(String item) {
		String reverse = "";
		for(int i = item.length()-1; i>=0; i--) {
			reverse = reverse + item.charAt(i);
		}
		return reverse;
	}
	
	public static String[] reverseArray(String[] myArray) {
		String[] newArray = new String[myArray.length];
		int j = myArray.length;
		for(int i = 0; i<myArray.length; i++) {
			newArray[j - 1] = myArray[i];
			j=j-1;
		}
		return newArray;
	}
	
	public static char[] reverseCharacterArray(String item) {
		char[] characters = new char[item.length()];
		int j = item.length();
		for(int i = 0; i<item.length(); i++) {
			characters[j-1] = item.charAt(i);
			j--;
		}
		return characters;
	}
	
	public static String getStringUsingIndex(String[] myArray, int index) {
		if(myArray == null || index<0 ||index >=myArray.length) {
			String item = "Array is null or index could not be found";
			return item;
		}
		else {
			return myArray[index];
		}
	}
	
	public static int getIndexofString(String[] myArray, String item) {
			if(myArray == null) {
				System.out.println("Array is null");
			} 
			
			for(int i = 0; i<myArray.length; i++) {
				if(myArray[i].equals(item)) {
					return i;
			}
		}
		System.out.println("-1 value means the String doesn't exist in the array");
		return -1;
	}
	
	public static void set(String[] myArray, int index, String item) {
		if(myArray == null || index<0 ||index >=myArray.length) {
			System.out.println("Array is null or index could not be found");
		}
		else {
			myArray[index] = item;
		}
	}
	
	public static String[] push(String[] myArray, String item) {
		String[] newArray = new String[myArray.length+1];
		for(int i = 0; i<myArray.length; i++)
		{
			newArray[i] = myArray[i];
		}
		newArray[myArray.length] = item;
		return newArray;
	}
	
	public static String[] pop(String[] myArray) {
		String[] newArray = new String[myArray.length-1];
		for(int i = 0; i<myArray.length-1; i++) {
			newArray[i] = myArray[i];
		}
		return newArray;
	}
	
	public static void rotateRight(String[] myArray, int n) {
		for(int i=0; i<n;i++) {
			String end = myArray[myArray.length-1];
		
			for(int j = myArray.length-1; j>0;j--) {
				myArray[j] = myArray[j-1];
			}
			myArray[0] = end;
		}
	}
	
	public static void rotateLeft(String[] myArray, int n) {
		for(int i=0; i<n;i++) {
			String start = myArray[0];
				
			for(int j = 0; j<myArray.length-1;j++) {
				myArray[j] = myArray[j+1];
			}
			
			myArray[myArray.length-1] = start;
		}
	}
	
	public static void reverse(String[] myArray, int n) {
		for(int i = 0; i<n/2; i++) {
			String temp = myArray[i];
			myArray[i] = myArray[n-i-1];
			myArray[n-i-1] = temp;
		}
	}
	
	public static String[] unshift(String[] myArray, String item) {
		String[] newArray = new String[myArray.length+1];
		for(int i = 0; i<myArray.length; i++) {
			newArray[i+1] = myArray[i];
		}
		newArray[0] = item;
		return newArray;
	}
	
	public static String[] shift(String[] myArray) {
		String[] newArray = new String[myArray.length-1];
		System.arraycopy(myArray, 1, newArray, 0, myArray.length-1);
		return newArray;
	}
	
	public static String[] removeElementatIndex(String[] myArray, int index) {
		if(myArray == null || index<0 ||index >=myArray.length) {
			System.out.println("Array is null or index could not be found");
			return myArray;
		}
		else {
			String newArray[] = new String[myArray.length-1]; 
			for(int i = 0, k=0; i<myArray.length;i++) {
				if(i == index) {
					continue;
				}
				newArray[k++] = myArray[i];
			}
			return newArray;
		}
	}
	
	public static String[] removeElementbyString(String[] myArray, String item) {
		if(myArray == null) {
			System.out.println("Array is null or index could not be found");
			return myArray;
		}
		else {
			String newArray[] = new String[myArray.length-1]; 
			for(int i = 0, k=0; i<myArray.length;i++) {
				if(myArray[i].equals(item)) {
					continue;
				}
				newArray[k++] = myArray[i];
			}
			return newArray;
		}
	}
	
	public static int[] mergeSortedArrays(int[] array1, int[] array2) {
		int[] mergedArray = new int[array1.length + array2.length];
		int i = 0, j = 0, k = 0;
		
		if(array1.length == 0 && array2.length == 0) {
			System.out.println("No value was found");
		}
		
		if(array1.length == 0) {
			return array2;
		}
		
		if(array2.length == 0) {
			return array1;
		}
		
		while(i<array1.length && j<array2.length) {
			if(array1[i] < array2[j]) {
				mergedArray[k++] = array1[i++];
			} 
			else {
				mergedArray[k++] = array2[j++];
			}
		}
		
		while(i<array1.length) {
			mergedArray[k++] = array1[i++];
		}
		
		while(j<array2.length) {
			mergedArray[k++] = array2[j++];
		}
		
		return mergedArray;
	}
}
