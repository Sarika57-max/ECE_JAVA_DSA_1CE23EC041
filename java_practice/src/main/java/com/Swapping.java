package com;

public class Swapping {
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int temp;
		System.out.println("The value of a is" + a);
		System.out.println("The value of b is" + b);
		
		temp = b;
		b = a;
		a = temp;
		System.out.println("Aftetr swapping");
		System.out.println("The value of a is" + a);
		System.out.println("The value of b is" + b);
		
		
	}

}

