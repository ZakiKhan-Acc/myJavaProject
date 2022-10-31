package designPatterns.creational.factory_method_pattern;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Meow!");
		
	}

	@Override
	public void moveAround() {
		System.out.println(getName()+ " is moving around");
	}

}