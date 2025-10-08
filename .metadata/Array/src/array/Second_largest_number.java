package array;

public class Second_largest_number {
	public static void main(String[] args) {
		int[]arr = {10,5,8,20};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num:arr) {
			if(num>largest) {
				secondLargest = largest;
				largest= num;
			}else if(num>secondLargest&&num!=largest) {
				secondLargest=num;
			}
		}
		System.out.println("Second largest:" + secondLargest);
	}

}
