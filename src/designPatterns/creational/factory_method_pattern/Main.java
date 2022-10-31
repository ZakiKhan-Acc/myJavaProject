package designPatterns.creational.factory_method_pattern;

public class Main {

	public static void main(String[] args) {
		
//		PetStore p = new PetStore();
//		Animal a = p.orderPet("Tom", "Cat");
//		a.makeSound();
//		a.moveAround();
		
		PetStore p = new PetStore(new PetStoreFactory());
		Animal a = p.orderPet("Tom", "Cat");
		a.makeSound();
		a.moveAround();
		
		
		

	}

}
