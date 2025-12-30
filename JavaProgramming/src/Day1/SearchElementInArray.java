package Day1;
//Linear Search
public class SearchElementInArray {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,30,70};
		int searchElement = 130;
		
		boolean status = false;	//false = not found ; true = found
		/*
		//Here for loop exit in 2 cases. one is if element found and second is after completion of all the numbers
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==searchElement)
			{
				System.out.println("Element found");
				status = true;
				break;
			}
			
		}
		*/
		
		for(int x:a)
		{
			if(x==searchElement)
			{
				System.out.println("Element found");
				status = true;
				break;
			}
		}
		//Even after completion of for loop if element is not found we need to make condition for element not found after for loop
		if(status == false)
		{
			System.out.println("Element Not found");
		}
		
		
		
		

	}

}
