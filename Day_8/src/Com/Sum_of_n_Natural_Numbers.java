package Com;

public class Sum_of_n_Natural_Numbers {
	public static int sum (int n) {
		if (n == 1) {
			return 1;
			
		}
		return n + sum(n - 1);
		
	}
	public static void main(String[] args) {
		int n = 5;
		int result = sum (n);
		System.out.println("Sum of first" + n + "Natural number is: " + result);
	}

}
