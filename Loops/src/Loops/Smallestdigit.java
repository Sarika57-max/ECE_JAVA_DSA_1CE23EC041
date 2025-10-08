package Loops;

import java.util.Scanner;

public class Smallestdigit {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n :");
		int n = sc.nextInt();
		
		int smallest = 9;
		int temp = n;
		while(temp>0) {
			int digit = temp% 10;
			
			if(digit< smallest) {
				smallest = digit;
				
			}
			temp/= 10;
		}
		System.out.println("Smallest digit in" + n +"="+ smallest);
		}
			
		
		
	}

