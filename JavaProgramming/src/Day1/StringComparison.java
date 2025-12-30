package Day1;

public class StringComparison {

	public static void main(String[] args) {
		
		/*
		//Case 1
		String s1 = "Welcome";
		String s2 = "Welcome";
		System.out.println(s1==s2);			//true-----It will compare the value of string variable
		System.out.println(s1.equals(s2));	//true-----It will compare the value of strign variable
	    */
		
		/*
		//Case 2
		String s1 = new String("Welcome");
		String s2 = new String("Welcome");
		System.out.println(s1==s2);			//false	----It will compare the objects
		System.out.println(s1.equals(s2));	//true------It will compare the values of object
		*/
		
		/*
		//Case 3
		String s1 = "Welcome";
		String s2 = new String("Welcome");
		System.out.println(s1==s2);			//false	----It will compare the objects
		System.out.println(s1.equals(s2));	//true------It will compare the values of object
		*/
		
		//Case 4
		String s1 = "Welcome";
		String s2 = new String("Welcome");
		String s3 = s2;
		System.out.println(s2==s3);			//true bcz objects are equal
		System.out.println(s2.equals(s3));	//true
		
		System.out.println(s1==s3);			//false bcz objects are note equal
		System.out.println(s1.equals(s3));	//true
		
	}

}
