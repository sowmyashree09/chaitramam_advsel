package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsPractice {
	
	@Test
	public void practice()
	
	{
	
		System.out.println("Step 1");
		System.out.println("Step 2");
		
		Assert.assertEquals(false,true); //1==1

		System.out.println("Step 3");
		System.out.println("Step 4");
		
		
		
		
		
	}
	
	
	@Test
	public void practice1()
	
	{
	    SoftAssert sa = new SoftAssert();
		System.out.println("Step 1");
		
		System.out.println("Step 2");
		
		sa.assertEquals(false,true); //failed
		
		System.out.println("Step 3");
		System.out.println("Step 4");
		
		Assert.assertEquals(0, 1);//failed
		
		sa.assertEquals("A", "A");//passed
		
		sa.assertAll();
		
		//150 lines - 10 softassertion statement
	}

}
