package code;

public class Town {
	
	//ACCESS MODIFIER: Usually variables are set to be private
	private String name;
	private int population;
	private int water;
	private int food;
	
	//CONSTRUCTOR - Usually used to set up the object
	//default constructor
	public Town()
	{
		name = "Shelbyville";
		population  = 100;
		water = 2000;
		food = 2000;
	}
	
	//overloaded constructors:
	public Town(String name)
	{
		this.name = name;
		population  = 100;
		water = 2000;
		food = 2000;
	}
	public Town(String name, int population)
	{
		this.name = name;
		this.population  = population;
		water = 2000;
		food = 2000;
	}
	
	public void endDay()
	{
		if(food < population)
			if(Math.random() < 0.30)
				population -= (int)(Math.random() * 10);

		water -= population;
		food -= population;
		if(Math.random() < 0.1 && food > 0 && water > 0)
			population += 1;
		
		if(food < 0)
			food = 0;
		if(water < 0)
			water = 0;
			
		
		
	}
	
	
	
	
	
	//ACCESSORS AND MODIFIERS
	//aka GETTERS AND SETTERS
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getPopulation(){
		return population;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getFood() {
		return food;
	}
	public void setFood(int food) {
		this.food = food;
	}
	public void setPopulation(int population){
		if(population >= 0)
			this.population = population;
	}
	

	
	
	
	
	
	
	
}
