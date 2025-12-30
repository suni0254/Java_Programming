package Day1;

public class Student {
		int sid;
		String sname;
		String sdept;
		
		void printData()
		{
			System.out.println(sid+ "  "+sname+"   "+sdept);
		}
		
		void setData(int id,String name, String dept)
		{
			sid = id;
			sname = name;
			sdept = dept;
		}
		
		Student(int id,String name, String dept)
		{
			sid = id;
			sname = name;
			sdept = dept;
		}
		
		
	

}
