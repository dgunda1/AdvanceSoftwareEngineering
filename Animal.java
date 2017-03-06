package AdvanceSoftwareEngineering; 

public class Animal {

	private String name;
	public Flys flyingType;
	public void setName(String newName){ name = newName; }
	public String getName(){ return name; }

	public String tryToFly(){
		 return flyingType.fly();
	 }
	
	public void setFlyingAbility(Flys newFlyType){
	 flyingType = newFlyType;
	  }


}
