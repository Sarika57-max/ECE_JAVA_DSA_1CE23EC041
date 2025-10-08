package com;

public class Armstrong_Number {
	public static void main(String[] args) {
		int num = 153                                                                                 ;
		int orginal = num;
		
		int sum = 0;
		
		while(num > 0 )
		{
			int digit = num % 10;
            sum = sum + (digit*digit*digit);
			num  = num / 10;
		}
		
		if(sum == orginal)
		{
			System.out.println("It is a armstrong number");
		}
		else {
			System.out.println("It is not a armstong number");
		}
	}

}
