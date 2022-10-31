package designPatterns.creational.factory_method_pattern;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Wooof!");
		
	}

	@Override
	public void moveAround() {
		System.out.println(getName()+ " is moving around");
	}

}
