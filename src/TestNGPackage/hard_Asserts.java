package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hard_Asserts 
{

	@Test
	public void Test()
	{
		String a="Nitesh";
		String b="Nitesh";
		String c=null;
		
		Assert.assertEquals(a, b, "Both Strings are not Equal");
//		Assert.assertEquals(a, c, "Both Strings are not Equal");
//		Assert.assertEquals(a, null, "Both Strings are Equal");
		
		Assert.assertNotEquals(a, c, "Both Strings are Equal");
//		Assert.assertNotEquals(a, b, "Both Strings are Equal");

		Assert.assertNull(c, "It is not null");
//		Assert.assertNull(a, "It is not null");
		
		Assert.assertNotNull(a, "It is null");
//		Assert.assertNotNull(c, "It is not null");
		
		Assert.assertTrue(true, "It is False condition");
//		Assert.assertTrue(false, "It is False condition");
		
		Assert.assertFalse(false, "It is True condition");
//		Assert.assertFalse(true, "It is True condition");
		
//		Assert.fail();

	}
}
