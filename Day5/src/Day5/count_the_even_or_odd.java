package Day5;

import java.util.Scanner;

public class count_the_even_or_odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements you want");
		int n = sc.nextInt();
		int evenCount = 0 , oddCount = 0;
		System.out.println("Enter" +n + "numbers:");
		 for (int i =0;i< n; i ++) {
			 int num = sc.nextInt();
			 if( num % 2 == 0)
			 {
				 evenCount ++;
			 }
			 else {
				 oddCount ++;
			 }
			 }
		 System.out.println("Total even numbers:" + evenCount); 
		 System.out.println("Total odd numbers:"+ oddCount);
		
		
	}

}
