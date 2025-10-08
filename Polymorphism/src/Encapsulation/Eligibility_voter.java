package Encapsulation;

import java.util.Scanner;

public class Eligibility_voter {
	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			
		System.out.println("Enter an age");
			
				int age = sc.nextInt();
				if(age > 18) {
					
					
				System.out.println(age +  " Eligibility to vote :");
				}
			else if (age < 18)
			{
				System.out.println(age +  " not eligiblity to vote:");
			}
				else {
					System.out.println("The age is Zero :" );
				}
	}

}
