package com;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 System.out.println("Enter a valid operator");
		 char operator = sc.next().charAt(0);
				 
		 switch(operator) {
		 case '+':
			 System.out.println("Sum =" + ( a + b));
			 break;
		 case '-':
			 System.out.println("Diffrence =" + (a - b));
			 break;
		 case '*':
			 System.out.println("Product =" + (a * b));
			 break;
		 case '/':
			 System.out.println("Quotient =" +(a / b));
			 break;
		 
		 
		 }
		 
	}

}
