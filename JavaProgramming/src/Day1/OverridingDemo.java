package Day1;

class Bank
{
	double roi()
	{
		return 0;
	}
}

class AXIS_Bank extends Bank
{
	double roi()
	{
		return 6.8;
	}
}

class ICICI_Bank extends Bank
{
	double roi()
	{
		return 7.8;
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		/*
		AXIS_Bank ab = new AXIS_Bank();
		System.out.println(ab.roi());
		*/
		
		ICICI_Bank ib = new ICICI_Bank();
		System.out.println(ib.roi());

	}

}
