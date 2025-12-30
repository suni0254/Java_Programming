package Day1;

class Animal
{
	String color = "white";
	
	void eat()
	{
		System.out.println("Eating");
	}
	
}

class Dog extends Animal
{
	String color = "Red";
	
	void displayColor()
	{
		//System.out.println(color);	//Will display child class variable
		System.out.println(super.color); //Will display parent class variable
	}
	void eat()
	{
		super.eat();						  //Will display Parent class method
		//System.out.println("Eating Bread"); //Will display child class method
	}
	
}
public class SuperKeyword {

	public static void main(String[] args) {
		Dog dobj = new Dog();
		dobj.displayColor();
		dobj.eat();
	}

}
