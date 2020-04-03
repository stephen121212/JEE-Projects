package HashMap;
import java.util.HashSet;

//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]
//It should return 1

//Given an array = [2,3,4,5]
//It should return -1

public class HashSetRecurringCharacters {
	public static void main (String args[]) {
		int[] array = new int[] {2,5,1,2,3,5,1,2,4};
		int[] array1 = new int[] {2,1,1,2,3,5,1,2,4};
		int[] array2 = new int[] {2,3,4,5};
		int hashValue1 = firstRecurringCharacterUsingHashSet(array);
		System.out.println(hashValue1);
		
		int arrayValue1 = firstRecurringCharacterUsingArray(array);
		System.out.println(arrayValue1);
		
		int hashValue2 =firstRecurringCharacterUsingHashSet(array1);
		System.out.println(hashValue2);
		
		int arrayValue2 = firstRecurringCharacterUsingArray(array);
		System.out.println(arrayValue2);
		
		int hashValue3 =firstRecurringCharacterUsingHashSet(array2);
		System.out.println(hashValue3);
		
		int arrayValue3 = firstRecurringCharacterUsingArray(array2);
		System.out.println(arrayValue3);
	}
	
	public static int firstRecurringCharacterUsingHashSet(int[]nums) {
		HashSet<Integer>set = new HashSet<Integer>();
		for(int x: nums) {
			if(set.contains(x)) {
				return x;
			}
			set.add(x);
		}
		return -1;
	}
	
	public static int firstRecurringCharacterUsingArray(int[]nums) {
		for(int i = 0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length; j++) {
				if(nums[i] == nums[j]) {
					return nums[i];
				}
			}
		}
		return -1;
	}
}
