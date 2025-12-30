package Day1;

interface Shape
{
	int length = 20;	//In Interface the variables are final static
	int width = 30;
	
	void circle();		//Abstract method(By default in Interface access level for method is "Public"
	
	//From Java 8 => default and static methods also allowed
	
	default void square()
	{
		System.out.println("This is square");
	}
	
	static void rectangle()
	{
		System.out.println("This is rectangle");
	}
	
	
}
public class InterfaceDemo implements Shape{
	
	int x=100,y =300;
	//By default in Class access level for method is "Default". So we should not decrease the visibility from Public to Default
	public void circle()
	{
		System.out.println("This is Circle ");
	}
	
	void triangle()
	{
		System.out.println("This is triangle");
	}
	
	public static void main(String[] args) {
		//Scenario 1===Obj and ref variable created for class
		InterfaceDemo iobj = new InterfaceDemo();
		System.out.println(Shape.length * Shape.width);	//Accessing Static variables directly using Interface name
		
		iobj.circle();	//Abstract method
		iobj.square();	//Default method
		Shape.rectangle();	//this method not directly from 'interfaceDemo class' it is from Interface so we need to call with interface name
		System.out.println(iobj.x + iobj.y);
		iobj.triangle();//Default method
		
		
		//Scenario 2===obj is created for class and ref variable is created for interface
		Shape sh = new InterfaceDemo();
		sh.circle();	//Abstract method
		sh.square();	//Default method
		Shape.rectangle();	//this method not directly from 'interfaceDemo class' it is from Interface so we need to call with interface name
		//System.out.println(sh.x + sh.y); 		//We cannot access with interface reference variable
		// sh.triangle();	//We cannot access with interface reference variable
	} 

}
