package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_Asserts
{

	@Test
	public void Test()
	{
		String a= "Miraj";
		String b= "Miraj";
		String c= null;
		
		SoftAssert SA= new SoftAssert();
		
		SA.assertEquals(a, b, "Both String values are not Equal");
//		SA.assertEquals(a, c, "Both String values are not Equal");
		
		SA.assertNotEquals(a, c, "Both String values are Equal");
//		SA.assertNotEquals(a, b, "Both String values are Equal");
		
		SA.assertNull(c, "Its not a null value");
//		SA.assertNull(a, "Its not a null value");
		
		SA.assertNotNull(a, "Its a null value");
//		SA.assertNotNull(c, "Its a null value");
		
		SA.assertTrue(true, "Its a False Value");
//		SA.assertTrue(false, "Its a False Value");
		
		SA.assertFalse(false, "Its a True Value");
//		SA.assertFalse(true, "Its a True Value");
		
//		SA.fail();
		
		SA.assertAll();
	}
}
