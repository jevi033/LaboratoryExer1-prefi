import java.util.Scanner;
public class RunAnimal{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bird b = new Bird();
		Cat c = new Cat();
		Dog d = new Dog();
		
	System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
	String choice = sc.nextLine();
	
	if (choice.equalsIgnoreCase("b")){
		b.eat();
		b.sleep();
		b.makeSound();
	}
	else if (choice.equalsIgnoreCase("c")){
		c.eat();
		c.sleep();
		c.makeSound();
	}
	else if (choice.equalsIgnoreCase("d")){
		d.eat();
		d.sleep();
		d.makeSound();	
	}
	else{
		System.out.println("Invalid input!");
		
	}	
}
}