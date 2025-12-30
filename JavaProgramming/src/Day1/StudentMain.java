package Day1;

public class StudentMain {

	public static void main(String[] args) {
		//Student st = new Student();
		
		/*
		//Store data into variables using object reference variable
		st.sid=101;
		st.sname = "sunil";
		st.sdept = "EEE";
		st.printData();
		*/
		
		/*
		//Store data into variables using method
		st.setData(101, "sunil", "EEE");
		st.printData();
		*/
		
		//Store data into variables using constructor
		Student stc = new Student(101, "Sunil", "EEE");
		stc.printData();
		
		

	}

}
