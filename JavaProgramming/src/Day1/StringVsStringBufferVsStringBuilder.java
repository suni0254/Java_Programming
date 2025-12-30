package Day1;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		/*
		//String is 'Immutable' Object so we cannot change
		String str1 = "Welcome";
		str1.concat(" to java");
		System.out.println(str1);	//Welcome
		
		
		String str2 = new String("Selenium");
		str2.concat(" Training");
		System.out.println(str2);	//Selenium
		*/
		
		//StringBuffer is 'Mutable' Object so we can change which have 'append()' method instead of 'concat()'
		StringBuffer str1 = new StringBuffer("Welcome");
		str1.append(" to java");
		System.out.println(str1);	//Welcome to java
		
		//StringBuilder is 'Mutable' Object so we can change which have 'append()' method instead of 'concat()'
		StringBuilder str2 = new StringBuilder("Selenium");
		str2.append(" Training");
		System.out.println(str2);	//Selenium Training
				

	}

}
