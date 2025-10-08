package Array;

import java.util.Scanner;

public class Find_positive_or_negative {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	System.out.println("Enter a number");
		
			int num = sc.nextInt();
			if(num > 0) {
				
				
			System.out.println(num +  " Is positive :");
			}
		else if (num < 0)
		{
			System.out.println(num +  " Is negative:");
		}
			else {
				System.out.println("The number is Zero :" );
			}
			
		}
		
	}


