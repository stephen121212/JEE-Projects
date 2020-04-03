package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class Adding80DynamicProgramming {
	private static Map<Integer, Integer> map = new HashMap();
	
	public static void main (String args[]) {
		System.out.println(memoisedToAdd(5));
		System.out.println(memoisedToAdd(6));
	}
	
	public static int memoisedToAdd(int n) {
		if(map.containsKey(n)) {
			return map.get(n);
		} else {
			System.out.println("Long Time");
			map.put(n, n+80);
			return map.get(n);
		}
	}
}
