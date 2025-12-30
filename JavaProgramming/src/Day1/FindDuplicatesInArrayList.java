package Day1;

public class FindDuplicatesInArrayList {
	
	public static void main(String[] args)
	{
		int a[] = {100,200,300,400,100,300,100,200};
		int num =300;
		int count = 0;
		
		
		for(int x:a)
		{
			if(x==num)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	

}
