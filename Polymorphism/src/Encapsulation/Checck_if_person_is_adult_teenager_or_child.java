package Encapsulation;

import java.util.Scanner;

public class Checck_if_person_is_adult_teenager_or_child {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter an age");
			
				int age = sc.nextInt();
				if(age > 16) {
					
					
				System.out.println(age +  " person is adult :");
				}
			else if (age < 20)
			{
				System.out.println(age +  " person is teeneger :");
			}
					System.out.println("person is child :" );
				}
	}


	


