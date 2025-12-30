package Day1;

public class DataConversionMethods {

	public static void main(String[] args) {
		/*
		//String----->int 
		//String s = "Welcome";	//Cannot convert
		
		String price1 = "120";
		String price2 = "130";
		int addPrice = Integer.parseInt(price1)+Integer.parseInt(price2);
		System.out.println(addPrice);
		*/
		
		/*
		//String---->double
		String price1 = "120.23";
		String price2 = "130.23";	
		System.out.println(Double.parseDouble(price1)+Double.parseDouble(price2));
		*/
		
		/*
		//String----->bool
		String b = "few";	//Otherthan 'true' if u pass anything it will give 'false'
		System.out.println(Boolean.parseBoolean(b));
		*/
		
		
		//int,double,bool,char---->String
		int a =10;
		double d = 34.64;
		char c = 'A';
		boolean b = true;
		
		String s1 = String.valueOf(a);
		System.out.println(s1);
		
		s1 = String.valueOf(d);
		System.out.println(s1);
		
		s1 = String.valueOf(c);
		System.out.println(s1);
		
		s1 = String.valueOf(b);
		System.out.println(s1);
		

	}

}
