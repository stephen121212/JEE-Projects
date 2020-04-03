package Factorial;

public class FactorialRecursive {
	public static void main(String args []) {
		System.out.println(FactorialRecursiveMethod(5));
	}
	
	public static int FactorialRecursiveMethod(int n) {
		if(n == 2) {
			return 2;
		}
		return n * FactorialRecursiveMethod(n-1);
	}
}
