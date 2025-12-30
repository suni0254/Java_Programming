package Day1;

public class ReverseString {

	public static void main(String[] args) {
		
		/*
		//Approach 1----Using String Methods=====length(), charAt()
		String str = "Selenium";
		String rev ="";
		
		//As it is a String we use String method 'length()'
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
			
		}
		System.out.println("Reverse String is: "+rev);
		*/
		
		/*
		//Approach 2----Without Using String Methods--By Converting String to CharArray type
		String str = "welcome";
		char c[] = str.toCharArray();
		String rev = "";
		
		//As it is a Array we use 'length'
		for(int i=c.length-1;i>=0;i--)
		{
			rev = rev+c[i];
		}		
		System.out.println("Reverse String is: "+rev );
		*/
		
		//Approach 3--Using StringBuffer Class
		//Note: In 'String' Class there is no reverse method but in 'StringBuffer' & 'StringBuilder' class we have reverse method
		StringBuffer sb = new StringBuffer("Welcome");
		System.out.println("Reverse String is: "+sb.reverse());

	}

}
