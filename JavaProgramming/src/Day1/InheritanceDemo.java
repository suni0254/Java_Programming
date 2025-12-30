package Day1;


class ABC
{
	int x;
	void print()
	{
		System.out.println("this is print method for "+ x);
	}
}

class XYZ extends ABC
{
	int y;
	void display()
	{
		System.out.println("this is print method for "+ y);
	}
}

class MNC extends ABC
{
	int z;
	void show()
	{
		System.out.println("this is print method for "+ z);
	}
}


public class InheritanceDemo
{

	public static void main(String[] args) {
		/*
		XYZ xobj = new XYZ();
		xobj.x= 89;
		xobj.y=90;
		xobj.print();
		xobj.display();
		*/
		
		MNC xobj = new MNC();
		xobj.x= 89;
		xobj.z=90;
		xobj.print();
		xobj.show();
		
		
		
		
		

	}

}
