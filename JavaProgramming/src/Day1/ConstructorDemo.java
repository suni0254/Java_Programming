package Day1;

public class ConstructorDemo {
	int x,y;
	ConstructorDemo() {
		x = 200; y =79;

	}

	ConstructorDemo(int a, int b)
	{
		x=a;
		y=b;
	}
	
	void printData()
	{
		System.out.println(x+y);
	}
	public static void main(String[] args) {

		//ConstructorDemo cd = new ConstructorDemo();		//Invoking Default Constructor
		
		ConstructorDemo cd = new ConstructorDemo(20,30);	//Invoking Parameterized Constructor
		cd.printData();

	}

}
