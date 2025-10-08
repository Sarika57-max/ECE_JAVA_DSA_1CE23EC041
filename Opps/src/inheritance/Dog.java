package inheritance;

public class Dog {
	public void eat()
	{
		System.out.println("Eating...");
	}

	public void bark() {

		
	}

}


class dog extends Dog {
	public void bark()
	{
		System.out.println("barking...");
	}
}

public class  main {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}
      