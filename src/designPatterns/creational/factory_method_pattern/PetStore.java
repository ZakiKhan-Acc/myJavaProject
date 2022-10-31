package designPatterns.creational.factory_method_pattern;

public class PetStore {

	// private Animal pet;

	private AnimalFactory animalFactory;

	public PetStore(AnimalFactory animalFactory) {
		super();
		this.animalFactory = animalFactory;
	}

	/*
	 * public Animal orderPet(String name , String type) {
	 * 
	 * //SOLID principles fails //Single repsonsibility fails order pet has 2
	 * responsibilty //open for modification
	 * 
	 * if(type.equals("Dog")){ this.pet = new Dog(name); } else
	 * if(type.equals("Cat")){ this.pet = new Cat(name); } else { throw new
	 * IllegalArgumentException(type); }
	 * 
	 * return pet; }
	 */

	/*
	 * public Animal orderPet(String name , String type) { return
	 * AnimalFactory.createAnaimal(type, name); }
	 */

	
	  public Animal orderPet(String name , String type) { 
		  return animalFactory.createAnaimal(type, name); 
	  }
	 

}
