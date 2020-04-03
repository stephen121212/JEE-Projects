package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class FibonnaciDynamicProgramming {
	static Map<Integer, Integer>map = new HashMap<Integer, Integer>();
	
	public static void main (String args[]) {
		System.out.println(fibonnaciSequence(4));
		System.out.println(fibonnaciSequence(5));
		System.out.println(fibonnaciSequence(6));
	}
	
	public static int fibonnaciSequence(int n) {
		if(n == 0) {
			return 1;
		}
		
		if(n == 1) {
			return 1;
		}
		
		if(map.containsKey(n)) {
			return map.get(n);
		}
		
		int result =  fibonnaciSequence(n-1) + fibonnaciSequence(n-2);
		map.put(n, result);
		return result;
	}
}
