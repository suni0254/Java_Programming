package Day1;

	class Parent
	{
		String name = "John";
		void m1()
		{
			System.out.println("This is m1 from parent");
		}
	}

	class Child extends Parent
	{
		int id =101;
		void m2()
		{
			System.out.println("This is m2 from child");
		}
	}
public class TypeCastingObjects1 {
	
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.name);	//Parent
		c.m1();						//Parent
		System.out.println(c.id);   //Child
		c.m2();                     //Child
		
		Parent p = new Child();		//Upcasting
		System.out.println(p.name);	//Parent
		p.m1();						//Parent
		//System.out.println(p.id);   //Child-----We cannot access
		//p.m2();                     //Child-----We cannot access
		
		//Child c = new Parent();		//Not possible. It is possible by Downcasting but it throws run time error
		
		/*
		Parent p1 = new Parent();
		Child c1 = (Child) p1;			//Downcasting
		System.out.println(c1.name);	//Parent
		c1.m1();						//Parent
		System.out.println(c1.id);   //Child
		c1.m2();          //Child
		*/
		
		
		
		

	}

}
