package Constructer;

public class Animal {
	public static void main(String[] args) {
		
	}
		 Animal(String type) {
		 System.out.println("Animal constructor: " + type);
}
}
class Dog extends Animal {
	 Dog() {
	 super("Dog"); 
	 System.out.println("Dog constructor");
}
}
public class Animal {
	 public static void main(String[] args) {
	 Dog d = new Dog()           
	 }
}
