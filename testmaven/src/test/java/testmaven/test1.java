package testmaven;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class test1 {

	
	@Test
	public void Dummy_test_to_passes()
	{
		Assert.assertEquals(1, 1);
	}
	
	@Test
	public void Dummy_test_to_fail()
	{
		Assert.assertEquals(1, 2);
	}
	
}
