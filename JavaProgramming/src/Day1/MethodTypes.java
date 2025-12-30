package Day1;

public class MethodTypes {
	//No parameter-No Return type
	void display()
	{
		System.out.println("Welcome");
	}	
	
	//No parameter-Return type
	String Print()
	{
		return "Print";
	}
	
	//Parameter - No Return type
	void sum(int a,int b)
	{
		System.out.println("addition of 2 numbers :"+ (a+b));
		
	}
	
	//Parameter - Return type
	int sub(int a, int b)
	{
		int c = a-b;
		return c;
		
	}
	
	public static void main(String[] args) {
		MethodTypes mt = new MethodTypes();
		mt.display();		//No parameter-No Return type
		
		String pr = mt.Print();
		System.out.println(pr);	//No parameter-Return type
		
		mt.sum(20,30);				//Parameter - No Return type
		
		int res = mt.sub(200,40);
		System.out.println("Subtraction of 2 numbers:" +res);	//Parameter - Return type
				
		
	}

}
