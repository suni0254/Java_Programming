package Day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Program Started");
		
		Thread.sleep(3000);
		
		FileInputStream fis = new FileInputStream("C:\\Program files");
		
		System.out.println("Program Completed");

	}

}
