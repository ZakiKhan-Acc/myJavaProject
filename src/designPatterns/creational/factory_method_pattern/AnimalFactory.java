package designPatterns.creational.factory_method_pattern;

public interface AnimalFactory {
	
	public  Animal createAnaimal(String type,String name);
	
	
	/*
	 * public static Animal createAnaimal(String type,String name) { Animal pet;
	 * 
	 * if(type.equals("Dog")){ pet = new Dog(name); } else if(type.equals("Cat")){
	 * pet = new Cat(name); } else { throw new IllegalArgumentException(type); }
	 * 
	 * return pet; }
	 */
}

