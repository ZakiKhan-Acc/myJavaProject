package designPatterns.creational.factory_method_pattern;

public abstract class Animal {
	
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

    public abstract void makeSound();
    
    public abstract void moveAround();
    	

}
