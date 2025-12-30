package Day1;

public class C1 extends C2 implements I1, I2{
	public void m1()
	{
		System.out.println(x);
	}

	public void m2()
	{
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		C1 cobj = new C1();
		cobj.m1();
		cobj.m2();
		cobj.m3();
		
	}

}
