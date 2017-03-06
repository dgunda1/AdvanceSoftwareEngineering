package AdvanceSoftwareEngineering;

public class Dog extends Animal{
	
	public void digHole(){
		
		System.out.println("Dug a hole");
		
	}
	
	public Dog(){
		
		super();
		
		setName("Dog");
		
		// We set the Flys interface polymorphically
		// This sets the behavior as a non-flying Animal
		
		flyingType = new CantFly();
		
	}

}