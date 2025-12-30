package Day1;

class Animals{
	
}
class Dogs extends Animals{
	
}
class Cats extends Animals{
	
	
}


public class DownTypeCastingTypes {

	public static void main(String[] args) {
		//A b = C d
		//Rule1: Type of d & c must have some relationship either Parent to child or vice versa
		//Animal an = new Dog();
		//Cat ct = (Cat) an;				//Valid as per Rule1
		
		//Dog dg =  new Dog();
		//Cat ct = (Cat)dg;					//Invalid as per Rule1
		
		//Rule2: Assignment is valid or not=='C' must be either same or child of 'A'
		//Animal an = new Dog();
		//Cat ct = (Cat)an;					//Valid as per Rule2
		
		//Animal an = new Dog();
		//Cat ct = (Dog)an;					//Invalid as per Rule2

		//Rule3: Underlying object type of 'd' must be either same or child of 'C'
		//Animal an = new Dog();
		//Cat ct = (Cat)an;					//Invalid as per Rule3
//Note:If Rule1 or Rule2 fails Compile time error occurs while Rule3 fails Run time error occurs
		
		//Satisfying Rule1, Rule2 & Rule3
		//Animal an = new Dog();
		//Dog dg = (Dog)an;
		
		//DownTypeCasting with In-built classes
		//Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer)o;		//Rule3 fails bcz no relation b/w String and StringBuffer
		
		//String s = new String("Welcome");
		//StringBuffer sb = (StringBuffer)s;		//Rule1 itself fails so no need to check Rule2 & 3
		
		//Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer)o;		//Rule 1&2 pass Rule 3 fails
		
		//Object o = new String("Welcome");
		//String s = (String)o;						//Satisfying Rule 1,2 &3
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
