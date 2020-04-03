package Factorial;

public class FactorialIterative {
	public static void main (String args[]) {
		System.out.println(factorialIterative(5));
	}
	
	public static int factorialIterative(int n){
		int answer = 1;
		if(n == 2) {
			return answer = 2;
		}
		
		for(int i = 2; i<=n; i++) {
			answer = answer * i;
		}
		return answer;
	}
}
