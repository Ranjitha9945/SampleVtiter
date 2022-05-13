package crm.sampleframe;

import org.testng.annotations.Test;

public class SampleClassTest
{
	@Test
	public void createContact()
	{
		System.out.println("execute createContact3");
		
		System.out.println("********url from cmd line*********"+System.getProperty("url"));
		System.out.println("********browser from eclipse*********"+System.getProperty("browser"));
	}

}
