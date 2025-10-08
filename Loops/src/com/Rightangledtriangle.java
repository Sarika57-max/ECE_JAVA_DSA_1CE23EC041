package com;

import java.util.Scanner;

public class Rightangledtriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleas enter the number of rows");
	int number = sc.nextInt();
			for(int row = 1; row<=number; row++)
		{
			for(int col = 1; col<=row;col++)
			{
				System.out.print(col +" ");
				}
			System.out.println();
		}
	}
}
